package ru.quipy.projection.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.quipy.projection.view.UserView
import java.util.*

interface ProjectUsersProjectionRepository : JpaRepository<UserView.ProjectUsers, UUID> {

    fun findByProjectId(projectId: UUID): List<UserView.ProjectUsers>
}