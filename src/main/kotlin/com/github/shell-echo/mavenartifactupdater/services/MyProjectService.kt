package com.github.shell-echo.mavenartifactupdater.services

import com.intellij.openapi.project.Project
import com.github.shell-echo.mavenartifactupdater.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
