package uoslife.alumniserver.domain.comment.domain.entity

import jakarta.persistence.*
import uoslife.alumniserver.domain.user.domain.entity.User
import uoslife.alumniserver.global.common.BaseEntity

@Entity
@Table(name = "comment_report")
class CommentReport(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "comment", nullable = false, foreignKey = ForeignKey(ConstraintMode.NO_CONSTRAINT))
    var comment: Comment? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false, foreignKey = ForeignKey(ConstraintMode.NO_CONSTRAINT))
    var user: User? = null,

    var reason: String? = null,
) :BaseEntity();