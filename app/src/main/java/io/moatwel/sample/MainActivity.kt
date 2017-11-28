package io.moatwel.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.moatwel.sample.service.ApiService
import io.moatwel.sample.service.HogeApiService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

  @Inject
  lateinit var apiService: ApiService

  @Inject
  lateinit var hogeApiService: HogeApiService

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    (application as Application).getAppComponent().inject(this)
  }
}
