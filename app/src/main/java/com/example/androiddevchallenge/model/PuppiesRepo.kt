package com.example.androiddevchallenge.model

object PuppyRepo {
    fun getPuppies(): List<Puppy> = puppy
    fun getPuppy(puppyId: Long) = puppy.find { it.id == puppyId }!!
}