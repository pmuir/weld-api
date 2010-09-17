package org.jboss.weld.context;

import javax.enterprise.context.spi.Context;

/**
 * <p>
 * Allows a thread-based context to be bound to some external instance storage
 * (such as an HttpSession).
 * </p>
 * 
 * <p>
 * A context may be <em>dettachable</em> in which case a call to
 * {@link ManagedContext#invalidate()} will dettach the context from it's
 * associated storage. A dettached context is still usable (instances may be
 * added or removed) however changes will not be written through to the
 * underlying data store.
 * </p>
 * 
 * @author Pete Muir
 * 
 * @param <S> the type of the external instance storage
 * @see ManagedContext
 */
public interface BoundContext<S> extends Context
{

   /**
    * Associate the context with the storage (for this thread). Once
    * {@link #associate(Object)} has been called, further calls to
    * {@link #associate(Object)} will be ignored, until the context has been
    * subsequently {@link #dissociate(Object)} from the storage.
    * 
    * @param storage the external storage
    * @return true if the storage was attached, otherwise false
    */
   public boolean associate(S storage);

   /**
    * Dissociate the context from the storage (for this thread). The context
    * will only dissociate from the same storage it associated with.
    * 
    * @param storage the external storage
    * @return true if the storage was dissociated
    */
   public boolean dissociate(S storage);

}
