package net.seichi915.seichi915loginmsg.listener

import net.seichi915.seichi915loginmsg.configuration.Configuration
import org.bukkit.event.player.PlayerQuitEvent
import org.bukkit.event.{EventHandler, Listener}

class PlayerQuitListener extends Listener {
  @EventHandler
  def onPlayerQuit(event: PlayerQuitEvent): Unit =
    Configuration.getLogoutMessage match {
      case Some(logoutMessage) =>
        event.setQuitMessage(
          logoutMessage.replaceAll("PLAYER", event.getPlayer.getName))
      case None =>
    }
}
