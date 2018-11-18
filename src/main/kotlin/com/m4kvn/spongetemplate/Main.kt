package com.m4kvn.spongetemplate

import org.slf4j.Logger
import org.spongepowered.api.plugin.Plugin
import javax.inject.Inject

@Plugin(
    id = "sponge-template",
    name = "Sponge Template",
    description = "This is Sponge Plugin Template"
)
class Main {

    @Inject
    lateinit var logger: Logger
}