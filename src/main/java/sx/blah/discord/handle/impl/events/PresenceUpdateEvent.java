package sx.blah.discord.handle.impl.events;

import sx.blah.discord.api.events.Event;
import sx.blah.discord.handle.obj.IGuild;
import sx.blah.discord.handle.obj.IUser;
import sx.blah.discord.handle.obj.Presences;

/**
 * This event is dispatched when a user changes his/her presence.
 */
public class PresenceUpdateEvent extends Event {

	private final IGuild guild;
	private final IUser user;
	private final Presences oldPresence, newPresence;

	public PresenceUpdateEvent(IGuild guild, IUser user, Presences oldPresence, Presences newPresence) {
		this.guild = guild;
		this.user = user;
		this.oldPresence = oldPresence;
		this.newPresence = newPresence;
	}

	public PresenceUpdateEvent(IUser user, Presences oldPresence, Presences newPresence) {
		this(null, user, oldPresence, newPresence);
	}

	/**
	 * Gets the user's new presence.
	 *
	 * @return The presence.
	 */
	public Presences getNewPresence() {
		return newPresence;
	}

	/**
	 * Gets the user's old presence.
	 *
	 * @return The presence.
	 */
	public Presences getOldPresence() {
		return oldPresence;
	}

	/**
	 * Gets the user involved.
	 *
	 * @return The user.
	 */
	public IUser getUser() {
		return user;
	}

	/**
	 * Gets the guild involved.
	 *
	 * @return The guild.
	 * @deprecated This is unreliable.
	 */
	@Deprecated
	public IGuild getGuild() {
		return guild;
	}
}
