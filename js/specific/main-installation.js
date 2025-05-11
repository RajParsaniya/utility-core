const dependency = new Map();

dependency.set(
	"tab1",
	`<dependency>\n\t<groupId>io.github.rajparsaniya</groupId>\n\t<artifactId>utility-core</artifactId>\n\t<version>1.0.0</version>\n</dependency>`
);
dependency.set("tab2", `implementation "io.github.rajparsaniya:utility-core:1.0.0"`);
dependency.set("tab3", `implementation("io.github.rajparsaniya:utility-core:1.0.0")`);
dependency.set("tab4", `libraryDependencies += "io.github.rajparsaniya" % "utility-core" % "1.0.0"`);
dependency.set("tab5", `<dependency org="io.github.rajparsaniya" name="utility-core" rev="1.0.0"/>`);
dependency.set("tab6", `@Grapes(\n\t@Grab(group="io.github.rajparsaniya", module="utility-core", version="1.0.0")\n)`);
dependency.set("tab7", `[io.github.rajparsaniya/utility-core "1.0.0"]`);
dependency.set("tab8", `"io.github.rajparsaniya:utility-core:jar:1.0.0"`);

loadDependency(dependency);
