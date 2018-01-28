import doodle.core._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

object ArchTarget {
  val coloredTarget =
    (
      Image.circle(10).fillColor(Color.red) on
        Image.circle(20).fillColor(Color.white) on
        Image.circle(30).fillColor(Color.red)
      )

  val stand =
    Image.rectangle(6, 20) above Image.rectangle(20, 6).fillColor(Color.brown)

  val ground =
    Image.rectangle(80, 25).lineWidth(0).fillColor(Color.green)

  val image = coloredTarget above stand above ground

  def main(args: Array[String]): Unit = {
    image.draw
  }
}
