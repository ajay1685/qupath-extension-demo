/*-
 * Copyright 2020-2021 Your Name
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package qupath.ext.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import qupath.ext.demo.commands.DemoCommands;
import qupath.lib.common.Version;
import qupath.lib.gui.QuPathGUI;
import qupath.lib.gui.extensions.GitHubProject;
import qupath.lib.gui.extensions.QuPathExtension;

import static qupath.lib.gui.ActionTools.getAnnotatedActions;

/**
 * Install demo extension.
 * <p>
 * This is a demo extension with menu entry and a command entry
 * Next version may have a sample dialog.
 * Based on Pete's StarDist extension
 * @author Ajay Zalavadia
 */
public class demoExtension implements QuPathExtension, GitHubProject {

	private final static Logger logger = LoggerFactory.getLogger(demoExtension.class);

	@Override
	public void installExtension(QuPathGUI qupath) {
		logger.info("Installing demo extension");
		qupath.installActions(getAnnotatedActions(new DemoCommands(qupath)));
	}

	@Override
	public String getName() {
		return "Demo extension";
	}

	@Override
	public String getDescription() {
		return "Sample description of the demo extension";
	}
	
	@Override
	public Version getQuPathVersion() {
		return Version.parse("0.3.0");
	}

	@Override
	public GitHubRepo getRepository() {
		return GitHubRepo.create(getName(), "ajay1685", "qupath-extension-demo");
	}

}
