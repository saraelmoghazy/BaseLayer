package com.saraelmoghazy.base.characterdetails.usecase

import com.saraelmoghazy.base.baselayer.BaseUseCase
import com.saraelmoghazy.base.characterdetails.model.SpeciesResponse
import com.saraelmoghazy.base.data.StarWarsRepository
import retrofit2.Response

class SpeciesUseCase(id: Int, private val repository: StarWarsRepository) :
    BaseUseCase<SpeciesResponse>(id) {

    var speciesId: Int = 0

    override suspend fun buildUseCase(): Response<SpeciesResponse> {
        return repository.getSpecies(speciesId)
    }
}