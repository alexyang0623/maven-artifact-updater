package com.github.shell-echo.mavenartifactupdater.listeners

import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import com.github.shell-echo.mavenartifactupdater.services.MyProjectService

internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.getService(MyProjectService::class.java)
    }
}
