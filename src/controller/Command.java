/*
   This file is part of j2dcg.
   j2dcg is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2 of the License, or
   (at your option) any later version.
   j2dcg is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   You should have received a copy of the GNU General Public License
   along with j2dcg; if not, write to the Free Software
   Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
package controller;

/**
 * <p>Title: Command</p>
 * <p>Description: The most abstract of all command objects</p>
 * <p>Copyright: Copyright (c) 2004 Eric Paquette</p>
 * <p>Company: (�TS) - �cole de Technologie Sup�rieure</p>
 * @author Eric Paquette
 * @version $Revision: 1.2 $
 */
public abstract class Command {
	public abstract void execute();
	public abstract void undo();
}
