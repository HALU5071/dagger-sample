package io.moatwel.sample

import android.app.Application
import io.moatwel.sample.component.AppComponent
import io.moatwel.sample.component.DaggerAppComponent
import io.moatwel.sample.module.ApiServiceModule

class Application : Application() {

  private lateinit var appComponent: AppComponent

  override fun onCreate() {
    super.onCreate()
    appComponent = DaggerAppComponent.builder()
      .apiServiceModule(ApiServiceModule())
      .build()
  }

  fun getAppComponent(): AppComponent = appComponent
}