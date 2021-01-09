package net.seichi915.seichi915loginmsg.configuration

import net.seichi915.seichi915loginmsg.Seichi915LoginMsg
import net.seichi915.seichi915loginmsg.util.Implicits._
import org.bukkit.ChatColor

object Configuration {
  def saveDefaultConfig(): Unit = Seichi915LoginMsg.instance.saveDefaultConfig()

  def getLoginMessage: Option[String] = {
    val loginMessage =
      Seichi915LoginMsg.instance.getConfig.getString("LoginMessage")
    if (loginMessage.isNull || loginMessage.isEmpty) return None
    Some(ChatColor.translateAlternateColorCodes('&', loginMessage))
  }
  def getLogoutMessage: Option[String] = {
    val logoutMessage =
      Seichi915LoginMsg.instance.getConfig.getString("LogoutMessage")
    if (logoutMessage.isNull || logoutMessage.isEmpty) return None
    Some(ChatColor.translateAlternateColorCodes('&', logoutMessage))
  }

}
