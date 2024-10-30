package uoslife.alumniserver.domain.notification.domain.entity

import jakarta.persistence.*
import uoslife.alumniserver.domain.comment.domain.entity.Comment
import uoslife.alumniserver.domain.notification.domain.entity.enums.NotificationType
import uoslife.alumniserver.domain.post.domain.entity.Post
import uoslife.alumniserver.domain.user.domain.entity.User
import uoslife.alumniserver.global.common.BaseEntity

@Entity
@Table(name = "notifications")
class Notification(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    var user: User? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "post_id", nullable = false)
    var post: Post? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "comment", nullable = false)
    var comment: Comment? = null,

    // Q: commenterId를 어떻게 처리해야할지 모르겠어요
    var commenterId: Long,

    @Enumerated(EnumType.STRING)
    var type: NotificationType,

    @Column(name = "read_status", nullable = false)
    var readStatus: Boolean? = false,
) :BaseEntity();