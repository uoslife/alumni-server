package uoslife.alumniserver.domain.post.domain.entity

import jakarta.persistence.*
import uoslife.alumniserver.domain.bookmark.domain.entity.Bookmark
import uoslife.alumniserver.domain.comment.domain.entity.Comment
import uoslife.alumniserver.domain.notification.domain.entity.Notification
import uoslife.alumniserver.domain.post.domain.entity.enums.type.PostType
import uoslife.alumniserver.domain.user.domain.entity.User
import uoslife.alumniserver.domain.user.domain.entity.enums.OccupationType
import uoslife.alumniserver.global.common.BaseEntity

@Entity
@Table(name = "posts")
class Post(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false, foreignKey = ForeignKey(ConstraintMode.NO_CONSTRAINT))
    var user: User? = null,

    @Enumerated(EnumType.STRING)
    var type: PostType,

    // TODO: 초기값 enum의 첫 번째 값으로 변경
    @Enumerated(EnumType.STRING)
    var occupation: OccupationType?,

    var title: String? = null,

    var content: String? = null,

    @Column(name = "like_count")
    var likeCount: Int? = 0,

    @Column(name = "comment_count")
    var commentCount: Int? = 0,

    @Column(name = "deleted_status")
    var deletedStatus: Boolean? = false,

    @OneToMany(mappedBy = "post")
    var postImage: MutableList<PostImage> = mutableListOf(),

    @OneToMany(mappedBy = "post")
    var comment: MutableList<Comment> = mutableListOf(),

    @OneToMany(mappedBy = "post")
    var bookmark: MutableList<Bookmark> = mutableListOf(),

    @OneToMany(mappedBy = "post")
    var notification: MutableList<Notification> = mutableListOf(),
) :BaseEntity();