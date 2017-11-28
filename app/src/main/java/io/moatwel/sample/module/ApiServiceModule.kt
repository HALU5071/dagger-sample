package io.moatwel.sample.module

import dagger.Module
import dagger.Provides
import io.moatwel.sample.service.ApiService
import retrofit2.Retrofit

@Module
open class ApiServiceModule {

  @Provides
  fun provideApiService(): ApiService {
    val retrofit = Retrofit.Builder()
      .baseUrl("https://api.moatwel.io")
      .build()
    return retrofit.create(ApiService::class.java)
  }
}