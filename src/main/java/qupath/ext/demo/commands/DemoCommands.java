package qupath.ext.demo.commands;

import org.controlsfx.control.action.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import qupath.lib.gui.ActionTools;
import qupath.lib.gui.QuPathGUI;
import qupath.lib.gui.tools.GuiTools;

import java.io.File;

/**
 * Demo Commands
 */
@SuppressWarnings("javadoc")
public class DemoCommands {
    Logger logger = LoggerFactory.getLogger(DemoCommands.class);
    @ActionTools.ActionMenu("Extensions>Demo Extension>Demo Menu>")
    @ActionTools.ActionDescription("Demo command description")
    public final Action actionDemo;

    public DemoCommands(QuPathGUI qupath) {
        actionDemo = ActionTools.actionBuilder("Open directory",
                        e -> {
                            // Try to reveal directory in Finder/Windows Explorer etc.
                            File dir = new File(String.valueOf(QuPathGUI.getExtensionDirectory()));
                            if (!dir.exists()) {
                                dir.mkdir();
                                logger.info("test logger");
                            }
                            GuiTools.openFile(dir);
                        }
                )
                .disabled(false)
                .longText("Open the script directory outside QuPath.")
                .build();
    }
}