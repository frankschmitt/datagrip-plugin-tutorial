package de.qwhon.datagripplugintutorial

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.fileChooser.FileChooser
import com.intellij.openapi.fileChooser.FileChooserDescriptor

class PopupDialogAction : AnAction() {
    override fun update(event: AnActionEvent) {
        // Using the event, evaluate the context,
        // and enable or disable the action.
    }

    override fun actionPerformed(event: AnActionEvent) {
        val descriptor = FileChooserDescriptor(true, false, false, false, false, false)
        FileChooser.chooseFiles(descriptor, null, null)
        // Using the event, implement an action.
        // For example, create and show a dialog.
    } // Override getActionUpdateThread() when you target 2022.3 or later!
}