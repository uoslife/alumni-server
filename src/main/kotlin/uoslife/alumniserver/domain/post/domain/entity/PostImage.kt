package uoslife.alumniserver.domain.post.domain.entity

import jakarta.persistence.*
import uoslife.alumniserver.global.common.BaseEntity

@Entity
@Table(name = "post_image")
class PostImage(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "post_id", nullable = false, foreignKey = ForeignKey(ConstraintMode.NO_CONSTRAINT))
    var post: Post? = null,

    var imageUrl: String? = null,
):BaseEntity();