package org.kotlin.mpp.mobile

//Functions to return the plataform name used on Kotlin

expect fun platformName(): String

fun createApplicationScreenMessage() : String {
    return "Kotlin Rocks on ${platformName()}"
}