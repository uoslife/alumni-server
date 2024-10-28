package uoslife.alumniserver.domain.post.domain.entity

import jakarta.persistence.*
import uoslife.alumniserver.domain.user.domain.entity.User
import uoslife.alumniserver.global.common.BaseEntity

@Entity
@Table(name = "post_like")
class PostLike(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "post_id", nullable = false)
    val post: Post? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    val user: User? = null,
) :BaseEntity();