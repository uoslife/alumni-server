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
    val user: User? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "parent_id", nullable = true)
    var parent: Comment? = null,

    @OneToMany(mappedBy = "parent")
    var child :MutableList<Comment> = mutableListOf(),

    var content: String? = null,

    @Column(name = "like_count")
    var likeCount: Int? = null,

    @Column(name = "deleted_status")
    var deletedStatus: Boolean? = null,

    @OneToMany(mappedBy = "comment")
    var commentLike: MutableList<CommentLike> = mutableListOf(),

    @OneToMany(mappedBy = "comment")
    var commentReport: MutableList<CommentReport> = mutableListOf(),

    @OneToMany(mappedBy = "comment")
    var notificaiton: MutableList<Notification> = mutableListOf(),
) :BaseEntity();