package com.github.xuzheng0912.rpa.core.auto.engine

import com.github.kwhat.jnativehook.GlobalScreen
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener
import com.github.kwhat.jnativehook.mouse.NativeMouseEvent
import com.github.kwhat.jnativehook.mouse.NativeMouseListener

object GlobalScreenScope {

    fun addKeyTypedListener(
        keyTypedAction: (NativeKeyEvent) -> Unit
    ) = GlobalScreen.addNativeKeyListener(object : NativeKeyListener {
        override fun nativeKeyTyped(nativeEvent: NativeKeyEvent) {
            keyTypedAction(nativeEvent)
        }
    })

    fun addMouseClickListener(
        clickAction: (NativeMouseEvent) -> Unit
    ) = GlobalScreen.addNativeMouseListener(object : NativeMouseListener {
        override fun nativeMouseClicked(nativeEvent: NativeMouseEvent) {
            clickAction(nativeEvent)
        }
    })
}

fun addNativeListener(
    block: GlobalScreenScope.() -> Unit
) {
    GlobalScreenScope.block()
}