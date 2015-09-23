
//Group,  ArtifactId, Version
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.7.0")

//jacoco
addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.1.2")

//scoverage
resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

resolvers += Resolver.url("scoverage-bintray", url("https://dl.bintray.com/sksamuel/sbt-plugins/"))(Resolver.ivyStylePatterns)

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.0")


addSbtPlugin("io.gatling" % "gatling-sbt" % "2.1.5")





