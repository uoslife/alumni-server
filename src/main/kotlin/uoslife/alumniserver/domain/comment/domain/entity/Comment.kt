package uoslife.alumniserver.domain.comment.domain.entity

import jakarta.persistence.*
import uoslife.alumniserver.domain.post.domain.entity.Post
import uoslife.alumniserver.domain.user.domain.entity.User
import uoslife.alumniserver.domain.notification.domain.entity.Notification
import uoslife.alumniserver.global.common.BaseEntity

@Entity
@Table(name = "comments")
class Comment(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "post_id", nullable = false)
    var post: Post? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    var user: User? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "parentComment_id", nullable = true)
    var parentComment: Comment? = null,

    @OneToMany(mappedBy = "parentComment")
    var childComment :MutableList<Comment> = mutableListOf(),

    var content: String? = null,

    @Column(name = "like_count")
    var likeCount: Int? = 0,

    @Column(name = "deleted_status")
    var deletedStatus: Boolean? = false,

    @OneToMany(mappedBy = "comment")
    var notificaiton: MutableList<Notification> = mutableListOf(),
) :BaseEntity();