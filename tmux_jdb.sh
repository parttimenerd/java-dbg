#!/bin/sh
tmux new-session -d -s jdb -- jdb -attach $2
