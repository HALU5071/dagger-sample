package io.moatwel.sample.module

import dagger.Module
import dagger.Provides
import io.moatwel.sample.service.HogeApiService
import retrofit2.Retrofit

@Module
open class HogeApiServiceModule {

  @Provides
  fun provideHogeApiService(): HogeApiService {
    val retrofit = Retrofit.Builder()
      .baseUrl("https://api.moatwel.io")  // No exist
      .build()
    return retrofit.create(HogeApiService::class.java)
  }
}
