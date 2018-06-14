@file:Suppress("NOTHING_TO_INLINE")

package pw.dotdash.solace.sponge.scoreboard

import org.spongepowered.api.scoreboard.Scoreboard
import org.spongepowered.api.scoreboard.objective.Objective
import pw.dotdash.solace.java.unwrapped
import pw.dotdash.solace.sponge.Server

inline val ServerScoreboard: Scoreboard?
    get() = Server.serverScoreboard.unwrapped

inline fun Scoreboard(building: Scoreboard.Builder.() -> Unit) =
        Scoreboard.builder().apply(building).build()

inline operator fun Scoreboard.plusAssign(objective: Objective): Unit = this.addObjective(objective)
inline operator fun Scoreboard.minusAssign(objective: Objective): Unit = this.removeObjective(objective)