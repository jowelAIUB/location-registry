package com.astalos.locationregistry.domain.interactor.locations

import com.astalos.locationregistry.domain.ILocationProvider
import com.astalos.locationregistry.domain.entities.SimpleLocation
import com.astalos.locationregistry.domain.interactor.OneOf
import com.astalos.locationregistry.domain.interactor.UseCase
import com.astalos.locationregistry.domain.repository.Failure
import javax.inject.Inject

/**
 * @author Tomasz Czura on 9/12/18.
 */
class GetCurrentLocation @Inject constructor(private val locationProvider: ILocationProvider) : UseCase<SimpleLocation, UseCase.NoParams>() {
    override suspend fun run(params: NoParams): OneOf<Failure, SimpleLocation> =
            locationProvider.getLocation()

    override fun cancel() {
        super.cancel()
        locationProvider.cancel()
    }
}