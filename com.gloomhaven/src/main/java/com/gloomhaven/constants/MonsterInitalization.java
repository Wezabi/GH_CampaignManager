package com.gloomhaven.constants;

import java.util.Hashtable;

/**
 * <p>
 * A compilation of initial {@link Monster} spawns.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public final class MonsterInitalization
{
    public static final Hashtable<String, String> MONSTER_INITILIZATION_BANDIT_GUARD_HASH_TABLE = new Hashtable<String, String>()
    {
        {
            put("1_4","ABcdef"); //$NON-NLS-1$ //$NON-NLS-2$
            put("1_3","abcdef"); //$NON-NLS-1$ //$NON-NLS-2$
            put("1_2","Abc"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    };
    
    public static final Hashtable<String, String> MOCK_MONSTER_INITILIZATION_BANDIT_GUARD_HASH_TABLE = new Hashtable<String, String>()
    {
        {
            put("1_4","AB"); //$NON-NLS-1$ //$NON-NLS-2$
            put("1_3","aB"); //$NON-NLS-1$ //$NON-NLS-2$
            put("1_2","ab"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    };
}
