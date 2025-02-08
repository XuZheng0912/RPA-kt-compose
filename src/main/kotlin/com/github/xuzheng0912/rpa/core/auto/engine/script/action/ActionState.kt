package com.github.xuzheng0912.rpa.core.auto.engine.script.action

enum class ActionState(
    val description: String,
    val value: String
) {
    Active("启用", "active"),
    Inactive("停用", "inactive"),
}