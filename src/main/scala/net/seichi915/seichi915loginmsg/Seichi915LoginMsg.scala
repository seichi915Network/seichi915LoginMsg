package net.seichi915.seichi915loginmsg

import net.seichi915.seichi915loginmsg.configuration.Configuration
import net.seichi915.seichi915loginmsg.listener._
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

object Seichi915LoginMsg {
  var instance: Seichi915LoginMsg = _
}

class Seichi915LoginMsg extends JavaPlugin {
  Seichi915LoginMsg.instance = this

  override def onEnable(): Unit = {
    Configuration.saveDefaultConfig()
    Seq(
      new PlayerJoinListener,
      new PlayerQuitListener
    ).foreach(Bukkit.getPluginManager.registerEvents(_, this))

    getLogger.info("seichi915LoginMsgが有効になりました。")
  }

  override def onDisable(): Unit = {
    getLogger.info("seichi915LoginMsgが無効になりました。")
  }
}
