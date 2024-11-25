package ru.quipy.projection.view

import javax.persistence.*
import ru.quipy.domain.Unique
import java.util.*

class UserView {
    @Entity
    @Table(name = "user_view")
    class User : Unique<UUID> {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        override var id: UUID = UUID.randomUUID()
            protected set

        @Column(name = "user_name", nullable = false)
        var userName: String = ""
            protected set

        @Column(name = "created_at", nullable = false)
        var createdAt: Long = System.currentTimeMillis()
            protected set

        // No-argument constructor
        constructor()

        // Parameterized constructor
        constructor(id: UUID, userName: String, createdAt: Long) {
            this.id = id
            this.userName = userName
            this.createdAt = createdAt
        }
    }

    @Entity
    @Table(name = "project_users")
    class ProjectUsers : Unique<UUID> {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        override var id: UUID = UUID.randomUUID()
            protected set

        @Column(name = "user_id", nullable = false)
        var userId: UUID = UUID.randomUUID()
            protected set

        @Column(name = "project_id", nullable = false)
        var projectId: UUID = UUID.randomUUID()
            protected set

        // No-argument constructor
        constructor()

        // Parameterized constructor
        constructor(id: UUID, userId: UUID, projectId: UUID) {
            this.id = id
            this.userId = userId
            this.projectId = projectId
        }
    }
}
