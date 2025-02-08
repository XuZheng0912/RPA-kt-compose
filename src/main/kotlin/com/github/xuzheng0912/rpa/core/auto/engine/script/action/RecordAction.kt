package com.github.xuzheng0912.rpa.core.auto.engine.script.action

interface RecordAction : RecordActionOrder, ActionSequence {
    fun execute()
}