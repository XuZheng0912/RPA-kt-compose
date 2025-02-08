package com.github.xuzheng0912.rpa.core.auto.engine

interface NativeActionPlayer {

    val isRunning: Boolean

    val isPaused: Boolean

    fun start()

    fun stop()

    fun pause()

}