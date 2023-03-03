package music_recommandation;
import music_recommandation.MusicRecommender;

object main {
  def main(args: Array[String]) = {
    val sequentialRecommender = new MusicRecommender(false)
    val parallelRecommender = new MusicRecommender(true)

    sequentialRecommender.getItemBasedModelRank("models/itemBasedModel.txt")
    sequentialRecommender.getUserBasedModelRank("models/userBasedModel.txt")
//    sequentialRecommender.getLinearCombinationModelRank(0.5, "models/linearCombination.txt")
//    parallelRecommender.getItemBasedModelRank("models/itemBasedModelP.txt")
//    parallelRecommender.getUserBasedModelRank("models/userBasedModelP.txt")
//    parallelRecommender.getLinearCombinationModelRank(0.5, "models/linearCombinationP.txt")
  }
}
