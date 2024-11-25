package ru.quipy.projection.repository

import org.springframework.data.jpa.repository.JpaRepository;
import ru.quipy.projection.view.UserView
import java.util.*

interface UserProjectionRepository : JpaRepository<UserView.User, UUID>