function openTab(tabName) {
	let tabContents = document.querySelectorAll(".tab-content");
	let tabButtons = document.querySelectorAll(".tab-button");

	tabContents.forEach((content) => {
		content.style.display = "none";
		content.classList.remove("active");
	});

	tabButtons.forEach((button) => {
		button.classList.remove("active");
	});

	document.getElementById(tabName).style.display = "block";
	document.getElementById(tabName).classList.add("active");
	event.currentTarget.classList.add("active");
}

function setDependency(element, dependency) {
	const id = element.id + "-dependency";

	let html = "";
	html += "<textarea id='" + id + "' readonly>";
	html += dependency;
	html += "</textarea>";

	element.innerHTML = html;
}

const dependency = {
	maven: `<dependency>\n\t<groupId>io.github.rajparsaniya</groupId>\n\t<artifactId>utility-core</artifactId>\n\t<version>1.0.0</version>\n</dependency>`,
	gradle: `implementation "io.github.rajparsaniya:utility-core:1.0.0"`,
	kotlin: `implementation("io.github.rajparsaniya:utility-core:1.0.0")`,
	sbt: `libraryDependencies += "io.github.rajparsaniya" % "utility-core" % "1.0.0"`,
	ivy: `<dependency org="io.github.rajparsaniya" name="utility-core" rev="1.0.0"/>`,
	grape: `@Grapes(\n\t@Grab(group="io.github.rajparsaniya", module="utility-core", version="1.0.0")\n)`,
	leiningen: `[io.github.rajparsaniya/utility-core "1.0.0"]`,
	buildr: `"io.github.rajparsaniya:utility-core:jar:1.0.0"`,
};

setDependency(document.getElementById("tab1"), dependency.maven);
setDependency(document.getElementById("tab2"), dependency.gradle);
setDependency(document.getElementById("tab3"), dependency.kotlin);
setDependency(document.getElementById("tab4"), dependency.sbt);
setDependency(document.getElementById("tab5"), dependency.ivy);
setDependency(document.getElementById("tab6"), dependency.grape);
setDependency(document.getElementById("tab7"), dependency.leiningen);
setDependency(document.getElementById("tab8"), dependency.buildr);
