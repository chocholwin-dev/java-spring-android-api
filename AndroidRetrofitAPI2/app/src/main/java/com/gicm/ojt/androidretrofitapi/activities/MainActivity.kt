package com.gicm.ojt.androidretrofitapi.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.gicm.ojt.androidretrofitapi.R
import com.gicm.ojt.androidretrofitapi.adapters.AccountListAdapter
import com.gicm.ojt.androidretrofitapi.models.AccountModel
import com.gicm.ojt.androidretrofitapi.services.AccountService
import com.gicm.ojt.androidretrofitapi.services.ServiceBuilder
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var adapter: AccountListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create the account service variable
        val accountService = ServiceBuilder.buildService(AccountService::class.java)

        // Create the request variable
        val accountRequest: Call<List<AccountModel>> = accountService.getAccList()

        // Create the request, then send it async
        accountRequest.enqueue(object : Callback<List<AccountModel>> {
            override fun onResponse(call: Call<List<AccountModel>>,
                                    response: Response<List<AccountModel>>) {
                if(response.isSuccessful){
                    val allAccountList = response.body()?.toList() as ArrayList<AccountModel>

                    rv_account_list.layoutManager = LinearLayoutManager(this@MainActivity)
                    rv_account_list.setHasFixedSize(true)

                    val adapter = AccountListAdapter(
                        this@MainActivity,
                        allAccountList
                    )

                    rv_account_list.adapter = adapter
                }
                else {
                    Log.i(MainActivity::class.simpleName, response.message())
                }
            }

            override fun onFailure(call: Call<List<AccountModel>>, t: Throwable) {
                t.message?.let { Log.i(MainActivity::class.simpleName, it) }
            }
        })
    }
}