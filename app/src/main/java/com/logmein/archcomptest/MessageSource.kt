package com.logmein.archcomptest

import io.reactivex.Single
import java.util.concurrent.TimeUnit

class MessageSource(customText: String) {

    val message: Single<String> = Single.just(customText)
                                        .delay(2, TimeUnit.SECONDS)
}