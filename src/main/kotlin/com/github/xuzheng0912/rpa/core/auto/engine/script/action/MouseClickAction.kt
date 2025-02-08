package com.github.xuzheng0912.rpa.core.auto.engine.script.action

import com.github.kwhat.jnativehook.mouse.NativeMouseEvent

class MouseClickAction(
    val event: NativeMouseEvent,
    override val nextAction: RecordAction? = null,
    override val actionOrder: Int = 0
) : RecordAction {

    override fun execute() {
        TODO("Not yet implemented")
    }
}