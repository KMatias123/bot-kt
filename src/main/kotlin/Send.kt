import Main.Colors.*
import net.ayataka.kordis.entity.message.Message

object Send {
    suspend fun Message.normal(description: String, title: String) {
        channel.send {
            embed {
                this.title = title
                this.description = description
                this.color = BLUE.color
            }
        }
    }

    suspend fun Message.normal(description: String) {
        channel.send {
            embed {
                this.description = description
                this.color = BLUE.color
            }
        }
    }

    suspend fun Message.success(description: String) {
        channel.send {
            embed {
                this.description = description
                color = SUCCESS.color
            }
        }
    }

    suspend fun Message.error(description: String) {
        channel.send {
            embed {
                this.title = "Error"
                this.description = description
                this.color = ERROR.color
            }
        }
    }
}