package net.seichi915.seichi915loginmsg.listener

import net.seichi915.seichi915loginmsg.configuration.Configuration
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.{EventHandler, Listener}

class PlayerJoinListener extends Listener {
  @EventHandler
  def onPlayerJoin(event: PlayerJoinEvent): Unit =
    Configuration.getLoginMessage match {
      case Some(loginMessage) =>
        event.setJoinMessage(
          loginMessage.replaceAll("PLAYER", event.getPlayer.getName))
      case None =>
    }
}
