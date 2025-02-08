package com.github.xuzheng0912.rpa.core.auto.engine.script

import com.github.xuzheng0912.rpa.core.auto.engine.script.action.RecordAction

interface ActionScript {
    val actions: List<RecordAction>
}