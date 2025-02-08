package com.github.xuzheng0912.rpa.core.auto.engine

interface ActionScriptPlayer {

    val isRunning: Boolean

    val isPaused: Boolean

    fun start()

    fun stop()

    fun pause()

}