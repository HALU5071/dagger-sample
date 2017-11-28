package io.moatwel.sample.component

import dagger.Component
import io.moatwel.sample.MainActivity
import io.moatwel.sample.service.ApiService
import io.moatwel.sample.module.ApiServiceModule
import io.moatwel.sample.module.HogeApiServiceModule
import io.moatwel.sample.service.HogeApiService

@Component(modules = arrayOf(ApiServiceModule::class, HogeApiServiceModule::class))
interface AppComponent {
  fun inject(target: MainActivity)
  val apiService: ApiService
  val hogeApiService: HogeApiService
}