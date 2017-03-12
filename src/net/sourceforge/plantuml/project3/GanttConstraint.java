/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * (C) Copyright 2009-2017, Arnaud Roques
 *
 * Project Info:  http://plantuml.com
 * 
 * This file is part of PlantUML.
 *
 * PlantUML is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PlantUML distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 *
 * Original Author:  Arnaud Roques
 * 
 *
 */
package net.sourceforge.plantuml.project3;

import net.sourceforge.plantuml.graphic.UDrawable;

public class GanttConstraint implements Complement {

	private final TaskInstant source;
	private final TaskInstant dest;

	public GanttConstraint(TaskInstant source, TaskInstant dest) {
		this.source = source;
		this.dest = dest;
	}

	@Override
	public String toString() {
		return source.toString() + " --> " + dest.toString();
	}

	public UDrawable getUDrawable(final TimeScale timeScale) {
		return new GanttArrow(timeScale, source, dest);
	}
}
