package uoslife.alumniserver.domain.bookmark.domain.entity

import jakarta.persistence.*
import uoslife.alumniserver.domain.post.domain.entity.Post
import uoslife.alumniserver.domain.user.domain.entity.User
import uoslife.alumniserver.global.common.BaseEntity

@Entity
@Table(name = "bookmarks")
data class Bookmark(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "post_id", nullable = false)
    var post: Post? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    var user: User? = null,
) :BaseEntity();