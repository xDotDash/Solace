@file:Suppress("NOTHING_TO_INLINE")

package pw.dotdash.solace.sponge.entity

import org.spongepowered.api.entity.Entity

inline operator fun Entity.contains(passenger: Entity): Boolean =
        this.hasPassenger(passenger)