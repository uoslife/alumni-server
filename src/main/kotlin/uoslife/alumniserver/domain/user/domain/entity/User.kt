package uoslife.alumniserver.domain.user.domain.entity

import jakarta.persistence.*
import uoslife.alumniserver.domain.bookmark.domain.entity.Bookmark
import uoslife.alumniserver.domain.notification.domain.entity.Notification
import uoslife.alumniserver.domain.post.domain.entity.Post
import uoslife.alumniserver.domain.post.domain.entity.PostLike
import uoslife.alumniserver.domain.post.domain.entity.PostReport
import uoslife.alumniserver.domain.user.domain.entity.enums.IdentityType
import uoslife.alumniserver.domain.user.domain.entity.enums.JobType
import uoslife.alumniserver.domain.user.domain.entity.enums.OccupationType
import uoslife.alumniserver.domain.user.domain.entity.enums.RoleType
import uoslife.alumniserver.global.common.BaseEntity
import java.time.LocalDateTime

@Entity
@Table(name = "users")
class User (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    val id: Long? = null,

    @Column(nullable = false, unique = true)
    var nickname: String,

    @Enumerated(EnumType.STRING)
    var role: RoleType = RoleType.USER,

    @Column(name = "entrance_year")
    var entranceYear: LocalDateTime? = null, // ex. 20xx-xx-xx

    @Enumerated(EnumType.STRING)
    var identity: IdentityType = IdentityType.UNDERGRADUATE,

    @Enumerated(EnumType.STRING)
    var occupation: OccupationType = OccupationType.FINANCE_OR_PROFESSIONAL,

    @Enumerated(EnumType.STRING)
    var job: JobType = JobType.FINANCIAL_SERVICE,

    @Column(name = "personal_email")
    var personalEmail: String? = null,

    @Column(name = "uos_email")
    var uosEmail: String? = null,

    @Column(name = "job_email")
    var jobEmail: String? = null,

    @Column(name = "job_certification")
    var jobCertification: Boolean = false,

    @Column(name = "show_personal_email_status")
    var showPersonalEmailStatus: Boolean? = false,

    @OneToMany(mappedBy = "user")
    var post: MutableList<Post> = mutableListOf(),

    @OneToMany(mappedBy = "user")
    var postLike: MutableList<PostLike> = mutableListOf(),

    @OneToMany(mappedBy = "user")
    var postReport: MutableList<PostReport> = mutableListOf(),

    @OneToMany(mappedBy = "user")
    var bookmark: MutableList<Bookmark> = mutableListOf(),

    @OneToMany(mappedBy = "user")
    var notificaiton: MutableList<Notification>? = mutableListOf(),
    ) : BaseEntity()